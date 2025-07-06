package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CashOff: ImageVector
    get() {
        if (_CashOff != null) {
            return _CashOff!!
        }
        _CashOff = ImageVector.Builder(
            name = "CashOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4.9f)
                verticalLineTo(4.95f)
                lineTo(3.05f, 4.94f)
                lineTo(4.11f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(16.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(4.57f, 3.91f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3f, 4.9f)
                moveTo(6.41f, 9.41f)
                curveTo(6.61f, 9.22f, 6.76f, 9f, 6.86f, 8.75f)
                lineTo(9.16f, 11.05f)
                curveTo(9.05f, 11.35f, 9f, 11.67f, 9f, 12f)
                curveTo(9f, 12.8f, 9.32f, 13.56f, 9.88f, 14.12f)
                curveTo(10.44f, 14.68f, 11.2f, 15f, 12f, 15f)
                curveTo(12.33f, 15f, 12.65f, 14.95f, 12.95f, 14.84f)
                lineTo(14.11f, 16f)
                horizontalLineTo(7f)
                curveTo(7f, 15.47f, 6.79f, 14.96f, 6.41f, 14.59f)
                curveTo(6.04f, 14.21f, 5.53f, 14f, 5f, 14f)
                verticalLineTo(10f)
                curveTo(5.53f, 10f, 6.04f, 9.79f, 6.41f, 9.41f)
                moveTo(17.69f, 14.5f)
                lineTo(21f, 17.8f)
                verticalLineTo(6f)
                horizontalLineTo(9.2f)
                lineTo(11.2f, 8f)
                horizontalLineTo(17f)
                curveTo(17f, 8.53f, 17.21f, 9.04f, 17.59f, 9.41f)
                curveTo(17.96f, 9.79f, 18.47f, 10f, 19f, 10f)
                verticalLineTo(14f)
                curveTo(18.5f, 14f, 18.05f, 14.18f, 17.69f, 14.5f)
                close()
            }
        }.build()

        return _CashOff!!
    }

@Suppress("ObjectPropertyName")
private var _CashOff: ImageVector? = null
