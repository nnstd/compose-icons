package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RemoteTvOff: ImageVector
    get() {
        if (_RemoteTvOff != null) {
            return _RemoteTvOff!!
        }
        _RemoteTvOff = ImageVector.Builder(
            name = "RemoteTvOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(17f, 20.25f)
                curveTo(16.86f, 21.24f, 16f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 20f)
                verticalLineTo(10.27f)
                lineTo(2f, 5.27f)
                moveTo(9f, 2f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 4f)
                verticalLineTo(15.18f)
                lineTo(13f, 11.18f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(9.82f)
                lineTo(7f, 5.18f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                moveTo(9f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                moveTo(13f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(18.27f)
                lineTo(14.73f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                moveTo(9f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(14.27f)
                lineTo(10.73f, 14f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _RemoteTvOff!!
    }

@Suppress("ObjectPropertyName")
private var _RemoteTvOff: ImageVector? = null
