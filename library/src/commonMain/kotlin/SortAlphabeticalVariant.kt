package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortAlphabeticalVariant: ImageVector
    get() {
        if (_SortAlphabeticalVariant != null) {
            return _SortAlphabeticalVariant!!
        }
        _SortAlphabeticalVariant = ImageVector.Builder(
            name = "SortAlphabeticalVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.25f, 5f)
                lineTo(12.5f, 1.75f)
                lineTo(15.75f, 5f)
                horizontalLineTo(9.25f)
                moveTo(15.75f, 19f)
                lineTo(12.5f, 22.25f)
                lineTo(9.25f, 19f)
                horizontalLineTo(15.75f)
                moveTo(8.89f, 14.3f)
                horizontalLineTo(6f)
                lineTo(5.28f, 17f)
                horizontalLineTo(2.91f)
                lineTo(6f, 7f)
                horizontalLineTo(9f)
                lineTo(12.13f, 17f)
                horizontalLineTo(9.67f)
                lineTo(8.89f, 14.3f)
                moveTo(6.33f, 12.68f)
                horizontalLineTo(8.56f)
                lineTo(7.93f, 10.56f)
                lineTo(7.67f, 9.59f)
                lineTo(7.42f, 8.63f)
                horizontalLineTo(7.39f)
                lineTo(7.17f, 9.6f)
                lineTo(6.93f, 10.58f)
                lineTo(6.33f, 12.68f)
                moveTo(13.05f, 17f)
                verticalLineTo(15.74f)
                lineTo(17.8f, 8.97f)
                verticalLineTo(8.91f)
                horizontalLineTo(13.5f)
                verticalLineTo(7f)
                horizontalLineTo(20.73f)
                verticalLineTo(8.34f)
                lineTo(16.09f, 15f)
                verticalLineTo(15.08f)
                horizontalLineTo(20.8f)
                verticalLineTo(17f)
                horizontalLineTo(13.05f)
                close()
            }
        }.build()

        return _SortAlphabeticalVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SortAlphabeticalVariant: ImageVector? = null
