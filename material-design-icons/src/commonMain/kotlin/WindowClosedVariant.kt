package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WindowClosedVariant: ImageVector
    get() {
        if (_WindowClosedVariant != null) {
            return _WindowClosedVariant!!
        }
        _WindowClosedVariant = ImageVector.Builder(
            name = "WindowClosedVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 20f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(1f)
                verticalLineTo(23f)
                horizontalLineTo(23f)
                verticalLineTo(20f)
                moveTo(19f, 4f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                moveTo(5f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                moveTo(5f, 20f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                moveTo(13f, 20f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _WindowClosedVariant!!
    }

@Suppress("ObjectPropertyName")
private var _WindowClosedVariant: ImageVector? = null
