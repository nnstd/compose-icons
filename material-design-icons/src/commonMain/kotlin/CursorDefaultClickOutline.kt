package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CursorDefaultClickOutline: ImageVector
    get() {
        if (_CursorDefaultClickOutline != null) {
            return _CursorDefaultClickOutline!!
        }
        _CursorDefaultClickOutline = ImageVector.Builder(
            name = "CursorDefaultClickOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 11f)
                lineTo(17.88f, 16.37f)
                lineTo(17f, 16.55f)
                lineTo(16.36f, 16.67f)
                curveTo(15.73f, 16.8f, 15.37f, 17.5f, 15.65f, 18.07f)
                lineTo(15.92f, 18.65f)
                lineTo(17.28f, 21.59f)
                lineTo(15.86f, 22.25f)
                lineTo(14.5f, 19.32f)
                lineTo(14.24f, 18.74f)
                curveTo(13.97f, 18.15f, 13.22f, 17.97f, 12.72f, 18.38f)
                lineTo(12.21f, 18.78f)
                lineTo(11.5f, 19.35f)
                verticalLineTo(11f)
                moveTo(10.76f, 8.69f)
                arcTo(0.76f, 0.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 9.45f)
                verticalLineTo(20.9f)
                curveTo(10f, 21.32f, 10.34f, 21.66f, 10.76f, 21.66f)
                curveTo(10.95f, 21.66f, 11.11f, 21.6f, 11.24f, 21.5f)
                lineTo(13.15f, 19.95f)
                lineTo(14.81f, 23.57f)
                curveTo(14.94f, 23.84f, 15.21f, 24f, 15.5f, 24f)
                curveTo(15.61f, 24f, 15.72f, 24f, 15.83f, 23.92f)
                lineTo(18.59f, 22.64f)
                curveTo(18.97f, 22.46f, 19.15f, 22f, 18.95f, 21.63f)
                lineTo(17.28f, 18f)
                lineTo(19.69f, 17.55f)
                curveTo(19.85f, 17.5f, 20f, 17.43f, 20.12f, 17.29f)
                curveTo(20.39f, 16.97f, 20.35f, 16.5f, 20f, 16.21f)
                lineTo(11.26f, 8.86f)
                lineTo(11.25f, 8.87f)
                curveTo(11.12f, 8.76f, 10.95f, 8.69f, 10.76f, 8.69f)
                moveTo(15f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                moveTo(13.83f, 4.76f)
                lineTo(16.66f, 1.93f)
                lineTo(18.07f, 3.34f)
                lineTo(15.24f, 6.17f)
                lineTo(13.83f, 4.76f)
                moveTo(10f, 0f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(0f)
                moveTo(3.93f, 14.66f)
                lineTo(6.76f, 11.83f)
                lineTo(8.17f, 13.24f)
                lineTo(5.34f, 16.07f)
                lineTo(3.93f, 14.66f)
                moveTo(3.93f, 3.34f)
                lineTo(5.34f, 1.93f)
                lineTo(8.17f, 4.76f)
                lineTo(6.76f, 6.17f)
                lineTo(3.93f, 3.34f)
                moveTo(7f, 10f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
            }
        }.build()

        return _CursorDefaultClickOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CursorDefaultClickOutline: ImageVector? = null
