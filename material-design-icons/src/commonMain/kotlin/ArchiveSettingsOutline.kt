package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveSettingsOutline: ImageVector
    get() {
        if (_ArchiveSettingsOutline != null) {
            return _ArchiveSettingsOutline!!
        }
        _ArchiveSettingsOutline = ImageVector.Builder(
            name = "ArchiveSettingsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                moveTo(19f, 6f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(19f)
                verticalLineTo(6f)
                moveTo(18f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                moveTo(15f, 10.5f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(10.5f)
                curveTo(9f, 10.22f, 9.22f, 10f, 9.5f, 10f)
                horizontalLineTo(14.5f)
                curveTo(14.78f, 10f, 15f, 10.22f, 15f, 10.5f)
                moveTo(7f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(11f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                moveTo(15f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _ArchiveSettingsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveSettingsOutline: ImageVector? = null
