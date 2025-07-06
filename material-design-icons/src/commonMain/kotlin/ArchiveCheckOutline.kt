package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveCheckOutline: ImageVector
    get() {
        if (_ArchiveCheckOutline != null) {
            return _ArchiveCheckOutline!!
        }
        _ArchiveCheckOutline = ImageVector.Builder(
            name = "ArchiveCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                moveTo(19f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                moveTo(14.5f, 11f)
                curveTo(14.78f, 11f, 15f, 11.22f, 15f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11.5f)
                curveTo(9f, 11.22f, 9.22f, 11f, 9.5f, 11f)
                horizontalLineTo(14.5f)
                moveTo(18f, 13.09f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13f, 19f, 13f)
                curveTo(18.66f, 13f, 18.33f, 13.04f, 18f, 13.09f)
                moveTo(13f, 19f)
                curveTo(13f, 19.7f, 13.13f, 20.37f, 13.35f, 21f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                moveTo(22.5f, 17.25f)
                lineTo(17.75f, 22f)
                lineTo(15f, 19f)
                lineTo(16.16f, 17.84f)
                lineTo(17.75f, 19.43f)
                lineTo(21.34f, 15.84f)
                lineTo(22.5f, 17.25f)
                close()
            }
        }.build()

        return _ArchiveCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveCheckOutline: ImageVector? = null
