package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Resize: ImageVector
    get() {
        if (_Resize != null) {
            return _Resize!!
        }
        _Resize = ImageVector.Builder(
            name = "Resize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.59f, 12f)
                lineTo(14.59f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(9.41f)
                lineTo(12f, 13.41f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(10.59f)
                moveTo(22f, 2f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(22f)
                moveTo(10f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _Resize!!
    }

@Suppress("ObjectPropertyName")
private var _Resize: ImageVector? = null
