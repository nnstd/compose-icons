package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderPound: ImageVector
    get() {
        if (_FolderPound != null) {
            return _FolderPound!!
        }
        _FolderPound = ImageVector.Builder(
            name = "FolderPound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.25f, 13f)
                horizontalLineTo(17.25f)
                lineTo(16.75f, 15f)
                horizontalLineTo(14.75f)
                lineTo(15.25f, 13f)
                moveTo(22f, 8f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 8f)
                moveTo(20f, 12f)
                horizontalLineTo(18.5f)
                lineTo(19f, 10f)
                horizontalLineTo(18f)
                lineTo(17.5f, 12f)
                horizontalLineTo(15.5f)
                lineTo(16f, 10f)
                horizontalLineTo(15f)
                lineTo(14.5f, 12f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(14.25f)
                lineTo(13.75f, 15f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(13.5f)
                lineTo(13f, 18f)
                horizontalLineTo(14f)
                lineTo(14.5f, 16f)
                horizontalLineTo(16.5f)
                lineTo(16f, 18f)
                horizontalLineTo(17f)
                lineTo(17.5f, 16f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(17.75f)
                lineTo(18.25f, 13f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _FolderPound!!
    }

@Suppress("ObjectPropertyName")
private var _FolderPound: ImageVector? = null
