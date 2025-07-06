package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderPoundOutline: ImageVector
    get() {
        if (_FolderPoundOutline != null) {
            return _FolderPoundOutline!!
        }
        _FolderPoundOutline = ImageVector.Builder(
            name = "FolderPoundOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(20f, 6f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(8f)
                curveTo(22f, 6.89f, 21.1f, 6f, 20f, 6f)
                moveTo(19f, 12f)
                verticalLineTo(11f)
                horizontalLineTo(17.5f)
                lineTo(18f, 9f)
                horizontalLineTo(17f)
                lineTo(16.5f, 11f)
                horizontalLineTo(14.5f)
                lineTo(15f, 9f)
                horizontalLineTo(14f)
                lineTo(13.5f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(13.25f)
                lineTo(12.75f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(12.5f)
                lineTo(12f, 17f)
                horizontalLineTo(13f)
                lineTo(13.5f, 15f)
                horizontalLineTo(15.5f)
                lineTo(15f, 17f)
                horizontalLineTo(16f)
                lineTo(16.5f, 15f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(16.75f)
                lineTo(17.25f, 12f)
                horizontalLineTo(19f)
                moveTo(15.75f, 14f)
                horizontalLineTo(13.75f)
                lineTo(14.25f, 12f)
                horizontalLineTo(16.25f)
                lineTo(15.75f, 14f)
                close()
            }
        }.build()

        return _FolderPoundOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderPoundOutline: ImageVector? = null
