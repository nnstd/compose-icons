package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RemoteTv: ImageVector
    get() {
        if (_RemoteTv != null) {
            return _RemoteTv!!
        }
        _RemoteTv = ImageVector.Builder(
            name = "RemoteTv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                curveTo(7.89f, 2f, 7f, 2.89f, 7f, 4f)
                verticalLineTo(20f)
                curveTo(7f, 21.11f, 7.89f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(16.11f, 22f, 17f, 21.11f, 17f, 20f)
                verticalLineTo(4f)
                curveTo(17f, 2.89f, 16.11f, 2f, 15f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                moveTo(11f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                moveTo(9f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                moveTo(13f, 14f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                moveTo(9f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                moveTo(13f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _RemoteTv!!
    }

@Suppress("ObjectPropertyName")
private var _RemoteTv: ImageVector? = null
