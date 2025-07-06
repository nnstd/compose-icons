package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectionEllipseArrowInside: ImageVector
    get() {
        if (_SelectionEllipseArrowInside != null) {
            return _SelectionEllipseArrowInside!!
        }
        _SelectionEllipseArrowInside = ImageVector.Builder(
            name = "SelectionEllipseArrowInside",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.2f, 4f)
                curveTo(9.94f, 4.12f, 8.72f, 4.53f, 7.64f, 5.2f)
                lineTo(6.64f, 3.47f)
                curveTo(7.95f, 2.64f, 9.45f, 2.13f, 11f, 2f)
                moveTo(17.53f, 6.25f)
                curveTo(16.62f, 5.39f, 15.53f, 4.73f, 14.34f, 4.33f)
                lineTo(15f, 2.39f)
                curveTo(16.5f, 2.84f, 17.89f, 3.66f, 19f, 4.78f)
                moveTo(5.34f, 7.41f)
                curveTo(4.64f, 8.44f, 4.19f, 9.6f, 4f, 10.83f)
                lineTo(2f, 10.55f)
                curveTo(2.2f, 9f, 2.79f, 7.5f, 3.7f, 6.23f)
                moveTo(22f, 12f)
                verticalLineTo(12.66f)
                lineTo(20f, 12.5f)
                verticalLineTo(12f)
                curveTo(20f, 10.92f, 19.81f, 9.86f, 19.39f, 8.86f)
                lineTo(21.22f, 8.06f)
                curveTo(21.75f, 9.31f, 22f, 10.65f, 22f, 12f)
                moveTo(6f, 17.3f)
                lineTo(4.5f, 18.61f)
                curveTo(3.47f, 17.43f, 2.72f, 16.04f, 2.3f, 14.53f)
                lineTo(4.17f, 14f)
                curveTo(4.53f, 15.22f, 5.16f, 16.35f, 6f, 17.3f)
                moveTo(12.14f, 22f)
                horizontalLineTo(12f)
                curveTo(10.5f, 22f, 9f, 21.68f, 7.64f, 21.07f)
                lineTo(8.53f, 19.24f)
                curveTo(9.62f, 19.75f, 10.8f, 20f, 12f, 20f)
                horizontalLineTo(12.19f)
                moveTo(17f, 21f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(18.42f)
                lineTo(21.14f, 19.76f)
                lineTo(19.73f, 21.17f)
                lineTo(17f, 18.5f)
            }
        }.build()

        return _SelectionEllipseArrowInside!!
    }

@Suppress("ObjectPropertyName")
private var _SelectionEllipseArrowInside: ImageVector? = null
