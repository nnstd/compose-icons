package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveArrowDown: ImageVector
    get() {
        if (_ArchiveArrowDown != null) {
            return _ArchiveArrowDown!!
        }
        _ArchiveArrowDown = ImageVector.Builder(
            name = "ArchiveArrowDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(4f, 21f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                moveTo(14f, 14f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                lineTo(12f, 19f)
                lineTo(17f, 14f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _ArchiveArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveArrowDown: ImageVector? = null
