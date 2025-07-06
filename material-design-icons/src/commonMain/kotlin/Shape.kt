package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Shape: ImageVector
    get() {
        if (_Shape != null) {
            return _Shape!!
        }
        _Shape = ImageVector.Builder(
            name = "Shape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13.5f)
                verticalLineTo(21.5f)
                horizontalLineTo(3f)
                verticalLineTo(13.5f)
                horizontalLineTo(11f)
                moveTo(12f, 2f)
                lineTo(17.5f, 11f)
                horizontalLineTo(6.5f)
                lineTo(12f, 2f)
                moveTo(17.5f, 13f)
                curveTo(20f, 13f, 22f, 15f, 22f, 17.5f)
                curveTo(22f, 20f, 20f, 22f, 17.5f, 22f)
                curveTo(15f, 22f, 13f, 20f, 13f, 17.5f)
                curveTo(13f, 15f, 15f, 13f, 17.5f, 13f)
                close()
            }
        }.build()

        return _Shape!!
    }

@Suppress("ObjectPropertyName")
private var _Shape: ImageVector? = null
