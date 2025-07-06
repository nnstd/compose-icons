package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PodiumSilver: ImageVector
    get() {
        if (_PodiumSilver != null) {
            return _PodiumSilver!!
        }
        _PodiumSilver = ImageVector.Builder(
            name = "PodiumSilver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10.09f)
                lineTo(22.45f, 11.58f)
                lineTo(21.8f, 8.77f)
                lineTo(24f, 6.89f)
                lineTo(21.11f, 6.64f)
                lineTo(20f, 4f)
                lineTo(18.87f, 6.64f)
                lineTo(16f, 6.89f)
                lineTo(18.18f, 8.77f)
                lineTo(17.5f, 11.58f)
                lineTo(20f, 10.09f)
                moveTo(23f, 23f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(23f)
                moveTo(1f, 17f)
                verticalLineTo(23f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(1f)
                moveTo(5f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                moveTo(9f, 10f)
                verticalLineTo(23f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                moveTo(13f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _PodiumSilver!!
    }

@Suppress("ObjectPropertyName")
private var _PodiumSilver: ImageVector? = null
