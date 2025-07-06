package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveArrowDownOutline: ImageVector
    get() {
        if (_ArchiveArrowDownOutline != null) {
            return _ArchiveArrowDownOutline!!
        }
        _ArchiveArrowDownOutline = ImageVector.Builder(
            name = "ArchiveArrowDownOutline",
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
                moveTo(10.5f, 11f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                lineTo(12f, 18f)
                lineTo(16f, 14f)
                horizontalLineTo(13.5f)
                verticalLineTo(11f)
            }
        }.build()

        return _ArchiveArrowDownOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveArrowDownOutline: ImageVector? = null
