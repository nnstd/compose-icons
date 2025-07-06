package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AxisYRotateCounterclockwise: ImageVector
    get() {
        if (_AxisYRotateCounterclockwise != null) {
            return _AxisYRotateCounterclockwise!!
        }
        _AxisYRotateCounterclockwise = ImageVector.Builder(
            name = "AxisYRotateCounterclockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                horizontalLineTo(14.91f)
                curveTo(14.57f, 17.45f, 13.4f, 20f, 12f, 20f)
                curveTo(10.42f, 20f, 9.12f, 16.73f, 9f, 12.58f)
                lineTo(7f, 11.43f)
                verticalLineTo(12f)
                curveTo(7f, 17.5f, 9.24f, 22f, 12f, 22f)
                curveTo(14.42f, 22f, 16.44f, 18.56f, 16.9f, 14f)
                horizontalLineTo(20f)
                lineTo(16f, 10f)
                lineTo(12f, 14f)
                moveTo(12f, 2f)
                curveTo(10.12f, 2f, 8.47f, 4.08f, 7.62f, 7.16f)
                lineTo(9.37f, 8.17f)
                curveTo(9.87f, 5.69f, 10.86f, 4f, 12f, 4f)
                curveTo(13.27f, 4f, 14.36f, 6.11f, 14.79f, 9.08f)
                lineTo(16f, 7.88f)
                lineTo(16.7f, 8.58f)
                curveTo(16f, 4.74f, 14.16f, 2f, 12f, 2f)
                moveTo(2.11f, 5.13f)
                lineTo(1.11f, 6.87f)
                lineTo(1.06f, 6.94f)
                lineTo(11.12f, 12.75f)
                lineTo(12.72f, 11.16f)
                lineTo(2.15f, 5.06f)
                lineTo(2.11f, 5.13f)
                moveTo(21.89f, 18.87f)
                lineTo(22.89f, 17.13f)
                lineTo(19.2f, 15f)
                horizontalLineTo(17.77f)
                lineTo(17.5f, 16.34f)
                lineTo(21.89f, 18.87f)
                close()
            }
        }.build()

        return _AxisYRotateCounterclockwise!!
    }

@Suppress("ObjectPropertyName")
private var _AxisYRotateCounterclockwise: ImageVector? = null
