package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreSearch: ImageVector
    get() {
        if (_StoreSearch != null) {
            return _StoreSearch!!
        }
        _StoreSearch = ImageVector.Builder(
            name = "StoreSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.9f, 10.9f)
                curveTo(10.64f, 12.17f, 10f, 13.84f, 10f, 15.5f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(15.5f)
                curveTo(10f, 16.35f, 10.17f, 17.2f, 10.5f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                horizontalLineTo(1f)
                verticalLineTo(10f)
                lineTo(2f, 5f)
                horizontalLineTo(18f)
                lineTo(18.89f, 9.46f)
                curveTo(16.56f, 8.53f, 13.79f, 9f, 11.9f, 10.9f)
                moveTo(18f, 2f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                moveTo(23.39f, 21f)
                lineTo(22f, 22.39f)
                lineTo(18.88f, 19.32f)
                curveTo(18.19f, 19.75f, 17.37f, 20f, 16.5f, 20f)
                curveTo(14f, 20f, 12f, 18f, 12f, 15.5f)
                reflectiveCurveTo(14f, 11f, 16.5f, 11f)
                reflectiveCurveTo(21f, 13f, 21f, 15.5f)
                curveTo(21f, 16.38f, 20.75f, 17.21f, 20.31f, 17.9f)
                lineTo(23.39f, 21f)
                moveTo(19f, 15.5f)
                curveTo(19f, 14.12f, 17.88f, 13f, 16.5f, 13f)
                reflectiveCurveTo(14f, 14.12f, 14f, 15.5f)
                reflectiveCurveTo(15.12f, 18f, 16.5f, 18f)
                reflectiveCurveTo(19f, 16.88f, 19f, 15.5f)
                close()
            }
        }.build()

        return _StoreSearch!!
    }

@Suppress("ObjectPropertyName")
private var _StoreSearch: ImageVector? = null
