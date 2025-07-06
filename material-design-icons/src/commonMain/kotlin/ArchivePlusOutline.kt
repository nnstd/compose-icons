package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchivePlusOutline: ImageVector
    get() {
        if (_ArchivePlusOutline != null) {
            return _ArchivePlusOutline!!
        }
        _ArchivePlusOutline = ImageVector.Builder(
            name = "ArchivePlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 13.09f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13f, 19f, 13f)
                curveTo(18.66f, 13f, 18.33f, 13.04f, 18f, 13.09f)
                moveTo(9.5f, 11f)
                curveTo(9.22f, 11f, 9f, 11.22f, 9f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(11.5f)
                curveTo(15f, 11.22f, 14.78f, 11f, 14.5f, 11f)
                horizontalLineTo(9.5f)
                moveTo(21f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                moveTo(19f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                moveTo(6f, 19f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(13.35f)
                curveTo(13.13f, 20.37f, 13f, 19.7f, 13f, 19f)
                horizontalLineTo(6f)
                moveTo(20f, 18f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _ArchivePlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchivePlusOutline: ImageVector? = null
