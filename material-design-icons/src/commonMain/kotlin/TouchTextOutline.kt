package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TouchTextOutline: ImageVector
    get() {
        if (_TouchTextOutline != null) {
            return _TouchTextOutline!!
        }
        _TouchTextOutline = ImageVector.Builder(
            name = "TouchTextOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(12.69f, 15.81f)
                horizontalLineTo(13.2f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(10.38f)
                lineTo(10.71f, 16.65f)
                curveTo(11.18f, 16.13f, 11.92f, 15.81f, 12.69f, 15.81f)
                moveTo(9f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(13.56f)
                lineTo(21f, 14.45f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(11.33f)
                lineTo(9f, 19f)
                moveTo(7f, 13f)
                horizontalLineTo(13.2f)
                verticalLineTo(11.73f)
                curveTo(13.2f, 11.5f, 13.25f, 11.24f, 13.31f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                moveTo(15.2f, 19.07f)
                lineTo(12.85f, 17.81f)
                horizontalLineTo(12.69f)
                curveTo(12.5f, 17.81f, 12.29f, 17.89f, 12.15f, 18.04f)
                lineTo(11.61f, 18.61f)
                lineTo(15.2f, 21.69f)
                curveTo(15.39f, 21.89f, 15.66f, 22f, 15.93f, 22f)
                horizontalLineTo(20.7f)
                curveTo(21.3f, 22f, 21.78f, 21.5f, 21.8f, 20.9f)
                verticalLineTo(17.7f)
                curveTo(21.8f, 17.28f, 21.57f, 16.89f, 21.18f, 16.71f)
                lineTo(17.55f, 15.11f)
                lineTo(16.67f, 15f)
                verticalLineTo(11.73f)
                curveTo(16.67f, 11.33f, 16.34f, 11f, 15.93f, 11f)
                curveTo(15.53f, 11f, 15.2f, 11.33f, 15.2f, 11.73f)
                verticalLineTo(19.07f)
                close()
            }
        }.build()

        return _TouchTextOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TouchTextOutline: ImageVector? = null
