package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountOff: ImageVector
    get() {
        if (_AccountOff != null) {
            return _AccountOff!!
        }
        _AccountOff = ImageVector.Builder(
            name = "AccountOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 8f)
                curveTo(16f, 9.95f, 14.6f, 11.58f, 12.75f, 11.93f)
                lineTo(8.07f, 7.25f)
                curveTo(8.42f, 5.4f, 10.05f, 4f, 12f, 4f)
                moveTo(12.28f, 14f)
                lineTo(18.28f, 20f)
                lineTo(20f, 21.72f)
                lineTo(18.73f, 23f)
                lineTo(15.73f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                curveTo(4f, 16.16f, 6.5f, 14.61f, 9.87f, 14.14f)
                lineTo(2.78f, 7.05f)
                lineTo(4.05f, 5.78f)
                lineTo(12.28f, 14f)
                moveTo(20f, 18f)
                verticalLineTo(19.18f)
                lineTo(15.14f, 14.32f)
                curveTo(18f, 14.93f, 20f, 16.35f, 20f, 18f)
                close()
            }
        }.build()

        return _AccountOff!!
    }

@Suppress("ObjectPropertyName")
private var _AccountOff: ImageVector? = null
