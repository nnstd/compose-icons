package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WatchImportVariant: ImageVector
    get() {
        if (_WatchImportVariant != null) {
            return _WatchImportVariant!!
        }
        _WatchImportVariant = ImageVector.Builder(
            name = "WatchImportVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 11f)
                horizontalLineTo(6f)
                lineTo(3.5f, 8.5f)
                lineTo(4.92f, 7.08f)
                lineTo(9.84f, 12f)
                lineTo(4.92f, 16.92f)
                lineTo(3.5f, 15.5f)
                lineTo(6f, 13f)
                horizontalLineTo(1f)
                verticalLineTo(11f)
                moveTo(8f, 0f)
                horizontalLineTo(16f)
                lineTo(16.83f, 5f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 7f)
                verticalLineTo(17f)
                curveTo(19f, 18.11f, 18.1f, 19f, 17f, 19f)
                horizontalLineTo(16.83f)
                lineTo(16f, 24f)
                horizontalLineTo(8f)
                lineTo(7.17f, 19f)
                horizontalLineTo(7f)
                curveTo(6.46f, 19f, 6f, 18.79f, 5.62f, 18.44f)
                lineTo(7.06f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(7.06f)
                lineTo(5.62f, 5.56f)
                curveTo(6f, 5.21f, 6.46f, 5f, 7f, 5f)
                horizontalLineTo(7.17f)
                lineTo(8f, 0f)
                close()
            }
        }.build()

        return _WatchImportVariant!!
    }

@Suppress("ObjectPropertyName")
private var _WatchImportVariant: ImageVector? = null
