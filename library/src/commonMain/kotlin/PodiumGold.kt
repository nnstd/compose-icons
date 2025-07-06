package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PodiumGold: ImageVector
    get() {
        if (_PodiumGold != null) {
            return _PodiumGold!!
        }
        _PodiumGold = ImageVector.Builder(
            name = "PodiumGold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.09f)
                lineTo(14.45f, 8.58f)
                lineTo(13.8f, 5.77f)
                lineTo(16f, 3.89f)
                lineTo(13.11f, 3.64f)
                lineTo(12f, 1f)
                lineTo(10.87f, 3.64f)
                lineTo(8f, 3.89f)
                lineTo(10.18f, 5.77f)
                lineTo(9.5f, 8.58f)
                lineTo(12f, 7.09f)
                moveTo(15f, 23f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
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

        return _PodiumGold!!
    }

@Suppress("ObjectPropertyName")
private var _PodiumGold: ImageVector? = null
