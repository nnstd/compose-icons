package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BagSuitcaseOff: ImageVector
    get() {
        if (_BagSuitcaseOff != null) {
            return _BagSuitcaseOff!!
        }
        _BagSuitcaseOff = ImageVector.Builder(
            name = "BagSuitcaseOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4.77f)
                lineTo(3.28f, 3.5f)
                lineTo(21f, 21.22f)
                lineTo(19.73f, 22.5f)
                lineTo(18f, 20.76f)
                curveTo(17.71f, 20.93f, 17.38f, 21f, 17.03f, 21f)
                curveTo(17.03f, 21.58f, 16.56f, 22f, 16f, 22f)
                curveTo(15.5f, 22f, 15f, 21.58f, 15f, 21f)
                horizontalLineTo(9f)
                curveTo(9f, 21.58f, 8.5f, 22f, 8f, 22f)
                curveTo(7.44f, 22f, 6.97f, 21.58f, 6.97f, 21f)
                curveTo(5.89f, 21f, 5f, 20.13f, 5f, 19f)
                verticalLineTo(7.77f)
                lineTo(2f, 4.77f)
                moveTo(17.03f, 6f)
                curveTo(18.11f, 6f, 19f, 6.88f, 19f, 8f)
                verticalLineTo(16.68f)
                lineTo(16f, 13.68f)
                verticalLineTo(9f)
                horizontalLineTo(14.5f)
                verticalLineTo(12.18f)
                lineTo(12.75f, 10.43f)
                verticalLineTo(9f)
                horizontalLineTo(11.32f)
                lineTo(8.31f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                curveTo(9f, 2.42f, 9.46f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(14.54f, 2f, 15f, 2.42f, 15f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(17.03f)
                moveTo(8f, 18f)
                horizontalLineTo(9.5f)
                verticalLineTo(12.27f)
                lineTo(8f, 10.77f)
                verticalLineTo(18f)
                moveTo(11.25f, 18f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.5f)
                lineTo(11.25f, 14f)
                verticalLineTo(18f)
                moveTo(14.5f, 18f)
                horizontalLineTo(15.23f)
                lineTo(14.5f, 17.27f)
                verticalLineTo(18f)
                moveTo(13.5f, 6f)
                verticalLineTo(3.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(6f)
                horizontalLineTo(13.5f)
                close()
            }
        }.build()

        return _BagSuitcaseOff!!
    }

@Suppress("ObjectPropertyName")
private var _BagSuitcaseOff: ImageVector? = null
