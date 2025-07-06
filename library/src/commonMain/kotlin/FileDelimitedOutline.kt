package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileDelimitedOutline: ImageVector
    get() {
        if (_FileDelimitedOutline != null) {
            return _FileDelimitedOutline!!
        }
        _FileDelimitedOutline = ImageVector.Builder(
            name = "FileDelimitedOutline",
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
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(10f, 19f)
                lineTo(12f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                lineTo(13f, 19f)
                horizontalLineTo(10f)
            }
        }.build()

        return _FileDelimitedOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileDelimitedOutline: ImageVector? = null
