package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileDelimited: ImageVector
    get() {
        if (_FileDelimited != null) {
            return _FileDelimited!!
        }
        _FileDelimited = ImageVector.Builder(
            name = "FileDelimited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.1f, 22f, 20f, 21.1f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(15f, 16f)
                lineTo(13f, 20f)
                horizontalLineTo(10f)
                lineTo(12f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                moveTo(13f, 9f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _FileDelimited!!
    }

@Suppress("ObjectPropertyName")
private var _FileDelimited: ImageVector? = null
