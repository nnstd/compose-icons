package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveAlertOutline: ImageVector
    get() {
        if (_ArchiveAlertOutline != null) {
            return _ArchiveAlertOutline!!
        }
        _ArchiveAlertOutline = ImageVector.Builder(
            name = "ArchiveAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                moveTo(7.5f, 11f)
                horizontalLineTo(12.5f)
                curveTo(12.78f, 11f, 13f, 11.22f, 13f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11.5f)
                curveTo(7f, 11.22f, 7.22f, 11f, 7.5f, 11f)
                moveTo(20f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                moveTo(20f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                moveTo(3f, 8f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _ArchiveAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveAlertOutline: ImageVector? = null
