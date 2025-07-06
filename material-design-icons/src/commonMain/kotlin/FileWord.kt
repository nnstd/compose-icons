package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileWord: ImageVector
    get() {
        if (_FileWord != null) {
            return _FileWord!!
        }
        _FileWord = ImageVector.Builder(
            name = "FileWord",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(15.2f, 20f)
                horizontalLineTo(13.8f)
                lineTo(12f, 13.2f)
                lineTo(10.2f, 20f)
                horizontalLineTo(8.8f)
                lineTo(6.6f, 11f)
                horizontalLineTo(8.1f)
                lineTo(9.5f, 17.8f)
                lineTo(11.3f, 11f)
                horizontalLineTo(12.6f)
                lineTo(14.4f, 17.8f)
                lineTo(15.8f, 11f)
                horizontalLineTo(17.3f)
                lineTo(15.2f, 20f)
                moveTo(13f, 9f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _FileWord!!
    }

@Suppress("ObjectPropertyName")
private var _FileWord: ImageVector? = null
