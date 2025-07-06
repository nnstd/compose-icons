package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BagSuitcaseOffOutline: ImageVector
    get() {
        if (_BagSuitcaseOffOutline != null) {
            return _BagSuitcaseOffOutline!!
        }
        _BagSuitcaseOffOutline = ImageVector.Builder(
            name = "BagSuitcaseOffOutline",
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
                lineTo(5f, 7.78f)
                lineTo(2f, 4.77f)
                moveTo(9.5f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(10.78f)
                lineTo(6.97f, 9.74f)
                verticalLineTo(19f)
                horizontalLineTo(16.23f)
                lineTo(15.25f, 18f)
                horizontalLineTo(14.5f)
                verticalLineTo(17.26f)
                lineTo(12.75f, 15.5f)
                verticalLineTo(18f)
                horizontalLineTo(11.25f)
                verticalLineTo(14f)
                lineTo(9.5f, 12.28f)
                verticalLineTo(18f)
                moveTo(12.75f, 9f)
                verticalLineTo(10.43f)
                lineTo(11.32f, 9f)
                horizontalLineTo(12.75f)
                moveTo(14.5f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(13.67f)
                lineTo(14.5f, 12.17f)
                verticalLineTo(9f)
                moveTo(17.03f, 6f)
                curveTo(18.11f, 6f, 19f, 6.88f, 19f, 8f)
                verticalLineTo(16.68f)
                lineTo(17.03f, 14.7f)
                verticalLineTo(8f)
                horizontalLineTo(10.33f)
                lineTo(8.31f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                curveTo(9f, 2.42f, 9.46f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(14.54f, 2f, 15f, 2.42f, 15f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(17.03f)
                moveTo(10.5f, 3.5f)
                verticalLineTo(6f)
                horizontalLineTo(13.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(10.5f)
                close()
            }
        }.build()

        return _BagSuitcaseOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BagSuitcaseOffOutline: ImageVector? = null
