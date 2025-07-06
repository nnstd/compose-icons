package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Transcribe: ImageVector
    get() {
        if (_Transcribe != null) {
            return _Transcribe!!
        }
        _Transcribe = ImageVector.Builder(
            name = "Transcribe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 19f)
                horizontalLineTo(4f)
                curveTo(2.89f, 19f, 2f, 18.1f, 2f, 17f)
                verticalLineTo(7f)
                curveTo(2f, 5.89f, 2.89f, 5f, 4f, 5f)
                horizontalLineTo(20f)
                moveTo(18f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(12.5f)
                lineTo(10.5f, 17f)
                horizontalLineTo(18f)
                moveTo(6f, 17f)
                horizontalLineTo(8.5f)
                lineTo(15.35f, 10.12f)
                curveTo(15.55f, 9.93f, 15.55f, 9.61f, 15.35f, 9.41f)
                lineTo(13.59f, 7.65f)
                curveTo(13.39f, 7.45f, 13.07f, 7.45f, 12.88f, 7.65f)
                lineTo(6f, 14.53f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Transcribe!!
    }

@Suppress("ObjectPropertyName")
private var _Transcribe: ImageVector? = null
