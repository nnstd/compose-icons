package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveArrowUp: ImageVector
    get() {
        if (_ArchiveArrowUp != null) {
            return _ArchiveArrowUp!!
        }
        _ArchiveArrowUp = ImageVector.Builder(
            name = "ArchiveArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 21f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                moveTo(14f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                lineTo(12f, 10f)
                lineTo(17f, 15f)
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
            }
        }.build()

        return _ArchiveArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveArrowUp: ImageVector? = null
