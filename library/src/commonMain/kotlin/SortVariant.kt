package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortVariant: ImageVector
    get() {
        if (_SortVariant != null) {
            return _SortVariant!!
        }
        _SortVariant = ImageVector.Builder(
            name = "SortVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                moveTo(3f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                moveTo(3f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _SortVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SortVariant: ImageVector? = null
