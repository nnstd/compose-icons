package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectionSearch: ImageVector
    get() {
        if (_SelectionSearch != null) {
            return _SelectionSearch!!
        }
        _SelectionSearch = ImageVector.Builder(
            name = "SelectionSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.27f, 18.9f)
                curveTo(19.7f, 18.21f, 19.95f, 17.38f, 19.95f, 16.5f)
                curveTo(19.95f, 14f, 17.95f, 12f, 15.46f, 12f)
                reflectiveCurveTo(10.96f, 14f, 10.96f, 16.5f)
                reflectiveCurveTo(12.96f, 21f, 15.46f, 21f)
                curveTo(16.33f, 21f, 17.15f, 20.75f, 17.84f, 20.32f)
                lineTo(20.96f, 23.39f)
                lineTo(22.35f, 22f)
                lineTo(19.27f, 18.9f)
                moveTo(15.46f, 19f)
                curveTo(14.07f, 19f, 12.96f, 17.88f, 12.96f, 16.5f)
                reflectiveCurveTo(14.07f, 14f, 15.46f, 14f)
                reflectiveCurveTo(17.95f, 15.12f, 17.95f, 16.5f)
                reflectiveCurveTo(16.84f, 19f, 15.46f, 19f)
                moveTo(22f, 14f)
                horizontalLineTo(21.45f)
                curveTo(21.12f, 13.19f, 20.62f, 12.47f, 20f, 11.86f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                moveTo(20f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                curveTo(21.11f, 2f, 22f, 2.9f, 22f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                moveTo(14f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                moveTo(4f, 2f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                curveTo(2f, 2.89f, 2.9f, 2f, 4f, 2f)
                moveTo(12f, 22f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                curveTo(10.5f, 20.82f, 11.2f, 21.5f, 12f, 22f)
                moveTo(4f, 20f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.11f, 2f, 20f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                moveTo(4f, 14f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _SelectionSearch!!
    }

@Suppress("ObjectPropertyName")
private var _SelectionSearch: ImageVector? = null
