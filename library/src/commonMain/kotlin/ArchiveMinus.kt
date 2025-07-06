package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveMinus: ImageVector
    get() {
        if (_ArchiveMinus != null) {
            return _ArchiveMinus!!
        }
        _ArchiveMinus = ImageVector.Builder(
            name = "ArchiveMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
                curveTo(19.34f, 13f, 19.67f, 13.04f, 20f, 13.09f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(13.35f)
                curveTo(13.13f, 20.37f, 13f, 19.7f, 13f, 19f)
                curveTo(13f, 15.69f, 15.69f, 13f, 19f, 13f)
                moveTo(9f, 13f)
                verticalLineTo(11.5f)
                curveTo(9f, 11.22f, 9.22f, 11f, 9.5f, 11f)
                horizontalLineTo(14.5f)
                curveTo(14.78f, 11f, 15f, 11.22f, 15f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                moveTo(23f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                close()
            }
        }.build()

        return _ArchiveMinus!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveMinus: ImageVector? = null
