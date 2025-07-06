package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveSettings: ImageVector
    get() {
        if (_ArchiveSettings != null) {
            return _ArchiveSettings!!
        }
        _ArchiveSettings = ImageVector.Builder(
            name = "ArchiveSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                horizontalLineTo(21f)
                moveTo(4f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                moveTo(9f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(10.5f)
                curveTo(15f, 10.22f, 14.78f, 10f, 14.5f, 10f)
                horizontalLineTo(9.5f)
                curveTo(9.22f, 10f, 9f, 10.22f, 9f, 10.5f)
                verticalLineTo(12f)
                moveTo(7f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
                moveTo(11f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                moveTo(15f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                close()
            }
        }.build()

        return _ArchiveSettings!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveSettings: ImageVector? = null
