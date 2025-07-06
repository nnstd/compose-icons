package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveArrowUpOutline: ImageVector
    get() {
        if (_ArchiveArrowUpOutline != null) {
            return _ArchiveArrowUpOutline!!
        }
        _ArchiveArrowUpOutline = ImageVector.Builder(
            name = "ArchiveArrowUpOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 21f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(21f)
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(5f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                moveTo(10.5f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                lineTo(12f, 10f)
                lineTo(16f, 14f)
                horizontalLineTo(13.5f)
                verticalLineTo(17f)
            }
        }.build()

        return _ArchiveArrowUpOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveArrowUpOutline: ImageVector? = null
