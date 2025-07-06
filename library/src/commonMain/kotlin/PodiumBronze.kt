package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PodiumBronze: ImageVector
    get() {
        if (_PodiumBronze != null) {
            return _PodiumBronze!!
        }
        _PodiumBronze = ImageVector.Builder(
            name = "PodiumBronze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 13.09f)
                lineTo(6.45f, 14.58f)
                lineTo(5.8f, 11.77f)
                lineTo(8f, 9.89f)
                lineTo(5.11f, 9.64f)
                lineTo(4f, 7f)
                lineTo(2.87f, 9.64f)
                lineTo(0f, 9.89f)
                lineTo(2.18f, 11.77f)
                lineTo(1.5f, 14.58f)
                lineTo(4f, 13.09f)
                moveTo(7f, 23f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(23f)
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
                moveTo(17f, 13f)
                verticalLineTo(23f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                moveTo(21f, 21f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _PodiumBronze!!
    }

@Suppress("ObjectPropertyName")
private var _PodiumBronze: ImageVector? = null
