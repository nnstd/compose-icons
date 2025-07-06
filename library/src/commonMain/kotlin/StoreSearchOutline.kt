package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreSearchOutline: ImageVector
    get() {
        if (_StoreSearchOutline != null) {
            return _StoreSearchOutline!!
        }
        _StoreSearchOutline = ImageVector.Builder(
            name = "StoreSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 4f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                moveTo(13.04f, 10f)
                horizontalLineTo(3.04f)
                lineTo(3.64f, 7f)
                horizontalLineTo(16.36f)
                lineTo(16.76f, 9f)
                curveTo(17.5f, 9.04f, 18.21f, 9.19f, 18.89f, 9.46f)
                lineTo(18f, 5f)
                horizontalLineTo(2f)
                lineTo(1f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                horizontalLineTo(10.5f)
                curveTo(10.17f, 17.2f, 10f, 16.35f, 10f, 15.5f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(15.5f)
                curveTo(10f, 13.84f, 10.64f, 12.17f, 11.9f, 10.9f)
                curveTo(12.26f, 10.55f, 12.64f, 10.25f, 13.04f, 10f)
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

        return _StoreSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StoreSearchOutline: ImageVector? = null
