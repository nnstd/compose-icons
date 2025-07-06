package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortReverseVariant: ImageVector
    get() {
        if (_SortReverseVariant != null) {
            return _SortReverseVariant!!
        }
        _SortReverseVariant = ImageVector.Builder(
            name = "SortReverseVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                moveTo(3f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                moveTo(3f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _SortReverseVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SortReverseVariant: ImageVector? = null
