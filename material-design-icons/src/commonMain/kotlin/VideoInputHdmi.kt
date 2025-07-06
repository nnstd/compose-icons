package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoInputHdmi: ImageVector
    get() {
        if (_VideoInputHdmi != null) {
            return _VideoInputHdmi!!
        }
        _VideoInputHdmi = ImageVector.Builder(
            name = "VideoInputHdmi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 7f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 2f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                lineTo(8f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                lineTo(19f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                moveTo(8f, 4f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _VideoInputHdmi!!
    }

@Suppress("ObjectPropertyName")
private var _VideoInputHdmi: ImageVector? = null
