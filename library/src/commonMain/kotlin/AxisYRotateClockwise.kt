package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AxisYRotateClockwise: ImageVector
    get() {
        if (_AxisYRotateClockwise != null) {
            return _AxisYRotateClockwise!!
        }
        _AxisYRotateClockwise = ImageVector.Builder(
            name = "AxisYRotateClockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                lineTo(16f, 14f)
                lineTo(20f, 10f)
                horizontalLineTo(16.9f)
                curveTo(16.44f, 5.44f, 14.42f, 2f, 12f, 2f)
                curveTo(10.12f, 2f, 8.47f, 4.08f, 7.62f, 7.16f)
                lineTo(9.37f, 8.17f)
                curveTo(9.87f, 5.69f, 10.86f, 4f, 12f, 4f)
                curveTo(13.4f, 4f, 14.57f, 6.55f, 14.91f, 10f)
                horizontalLineTo(12f)
                moveTo(1.11f, 6.87f)
                lineTo(13.89f, 14.25f)
                lineTo(13.96f, 13.46f)
                lineTo(10.5f, 10f)
                horizontalLineTo(10.54f)
                lineTo(2.11f, 5.13f)
                lineTo(1.11f, 6.87f)
                moveTo(21.89f, 18.87f)
                lineTo(22.89f, 17.13f)
                lineTo(17.88f, 14.24f)
                curveTo(17.79f, 14.97f, 17.67f, 15.67f, 17.5f, 16.34f)
                lineTo(21.89f, 18.87f)
                moveTo(12f, 22f)
                curveTo(14.3f, 22f, 16.23f, 18.9f, 16.82f, 14.68f)
                lineTo(16f, 15.5f)
                lineTo(14.87f, 14.37f)
                curveTo(14.5f, 17.63f, 13.35f, 20f, 12f, 20f)
                curveTo(10.42f, 20f, 9.12f, 16.73f, 9f, 12.58f)
                lineTo(7f, 11.43f)
                verticalLineTo(12f)
                curveTo(7f, 17.5f, 9.24f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _AxisYRotateClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _AxisYRotateClockwise: ImageVector? = null
