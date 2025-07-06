package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TranscribeClose: ImageVector
    get() {
        if (_TranscribeClose != null) {
            return _TranscribeClose!!
        }
        _TranscribeClose = ImageVector.Builder(
            name = "TranscribeClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23f)
                lineTo(8f, 19f)
                horizontalLineTo(16f)
                lineTo(12f, 23f)
                moveTo(20f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 17f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 15f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3f)
                horizontalLineTo(20f)
                moveTo(18f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(12.5f)
                lineTo(10.5f, 15f)
                horizontalLineTo(18f)
                moveTo(6f, 15f)
                horizontalLineTo(8.5f)
                lineTo(15.35f, 8.12f)
                curveTo(15.55f, 7.93f, 15.55f, 7.61f, 15.35f, 7.42f)
                lineTo(13.59f, 5.65f)
                curveTo(13.39f, 5.45f, 13.07f, 5.45f, 12.88f, 5.65f)
                lineTo(6f, 12.53f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _TranscribeClose!!
    }

@Suppress("ObjectPropertyName")
private var _TranscribeClose: ImageVector? = null
