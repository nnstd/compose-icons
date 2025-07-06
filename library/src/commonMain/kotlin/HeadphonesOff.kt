package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadphonesOff: ImageVector
    get() {
        if (_HeadphonesOff != null) {
            return _HeadphonesOff!!
        }
        _HeadphonesOff = ImageVector.Builder(
            name = "HeadphonesOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10f)
                verticalLineTo(17f)
                curveTo(21f, 17.62f, 20.81f, 18.19f, 20.5f, 18.67f)
                lineTo(15f, 13.18f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                curveTo(10f, 3f, 8.23f, 3.82f, 6.96f, 5.14f)
                lineTo(5.55f, 3.72f)
                curveTo(7.18f, 2.04f, 9.47f, 1f, 12f, 1f)
                moveTo(2.78f, 3.5f)
                lineTo(20.5f, 21.22f)
                lineTo(19.23f, 22.5f)
                lineTo(16.73f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(18.27f)
                lineTo(9f, 12.27f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17f)
                verticalLineTo(10f)
                curveTo(3f, 8.89f, 3.2f, 7.82f, 3.57f, 6.84f)
                lineTo(1.5f, 4.77f)
                lineTo(2.78f, 3.5f)
                moveTo(5.17f, 8.44f)
                curveTo(5.06f, 8.94f, 5f, 9.46f, 5f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(8.73f)
                lineTo(5.17f, 8.44f)
                close()
            }
        }.build()

        return _HeadphonesOff!!
    }

@Suppress("ObjectPropertyName")
private var _HeadphonesOff: ImageVector? = null
