package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveEditOutline: ImageVector
    get() {
        if (_ArchiveEditOutline != null) {
            return _ArchiveEditOutline!!
        }
        _ArchiveEditOutline = ImageVector.Builder(
            name = "ArchiveEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12.13f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(10.3f)
                curveTo(19.78f, 10.42f, 19.57f, 10.56f, 19.39f, 10.74f)
                lineTo(18f, 12.13f)
                moveTo(9.5f, 11f)
                curveTo(9.22f, 11f, 9f, 11.22f, 9f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(11.5f)
                curveTo(15f, 11.22f, 14.78f, 11f, 14.5f, 11f)
                horizontalLineTo(9.5f)
                moveTo(6f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(19.13f)
                lineTo(11.13f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
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
                moveTo(13f, 19.96f)
                verticalLineTo(22f)
                horizontalLineTo(15.04f)
                lineTo(21.17f, 15.88f)
                lineTo(19.13f, 13.83f)
                lineTo(13f, 19.96f)
                moveTo(22.85f, 13.47f)
                lineTo(21.53f, 12.15f)
                curveTo(21.33f, 11.95f, 21f, 11.95f, 20.81f, 12.15f)
                lineTo(19.83f, 13.13f)
                lineTo(21.87f, 15.17f)
                lineTo(22.85f, 14.19f)
                curveTo(23.05f, 14f, 23.05f, 13.67f, 22.85f, 13.47f)
                close()
            }
        }.build()

        return _ArchiveEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveEditOutline: ImageVector? = null
