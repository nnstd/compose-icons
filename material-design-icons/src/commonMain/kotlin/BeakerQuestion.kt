package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BeakerQuestion: ImageVector
    get() {
        if (_BeakerQuestion != null) {
            return _BeakerQuestion!!
        }
        _BeakerQuestion = ImageVector.Builder(
            name = "BeakerQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                curveTo(16.9f, 5f, 16f, 5.9f, 16f, 7f)
                verticalLineTo(19f)
                curveTo(16f, 20.1f, 15.1f, 21f, 14f, 21f)
                horizontalLineTo(4f)
                curveTo(2.9f, 21f, 2f, 20.1f, 2f, 19f)
                verticalLineTo(7f)
                curveTo(2f, 5.9f, 1.1f, 5f, 0f, 5f)
                verticalLineTo(3f)
                moveTo(4f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                moveTo(4f, 11f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                moveTo(7f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                moveTo(9f, 14f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                moveTo(9f, 8f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                moveTo(21.5f, 15.5f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(15.5f)
                horizontalLineTo(21.5f)
                moveTo(19.5f, 10.5f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                curveTo(18f, 8.34f, 19.34f, 7f, 21f, 7f)
                curveTo(22.66f, 7f, 24f, 8.34f, 24f, 10f)
                curveTo(24f, 10.97f, 23.5f, 11.88f, 22.71f, 12.41f)
                lineTo(22.41f, 12.6f)
                curveTo(21.84f, 13f, 21.5f, 13.62f, 21.5f, 14.3f)
                verticalLineTo(14.5f)
                horizontalLineTo(20f)
                verticalLineTo(14.3f)
                curveTo(20f, 13.11f, 20.6f, 12f, 21.59f, 11.35f)
                lineTo(21.88f, 11.16f)
                curveTo(22.27f, 10.9f, 22.5f, 10.47f, 22.5f, 10f)
                curveTo(22.5f, 9.18f, 21.83f, 8.5f, 21f, 8.5f)
                curveTo(20.17f, 8.5f, 19.5f, 9.17f, 19.5f, 10f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()

        return _BeakerQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _BeakerQuestion: ImageVector? = null
