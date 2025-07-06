package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDecision: ImageVector
    get() {
        if (_ArrowDecision != null) {
            return _ArrowDecision!!
        }
        _ArrowDecision = ImageVector.Builder(
            name = "ArrowDecision",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 5f)
                horizontalLineTo(8f)
                lineTo(12f, 1f)
                lineTo(16f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(9.43f)
                curveTo(12.25f, 9.89f, 11.58f, 10.46f, 11f, 11.12f)
                verticalLineTo(5f)
                moveTo(22f, 11f)
                lineTo(18f, 7f)
                verticalLineTo(10f)
                curveTo(14.39f, 9.85f, 11.31f, 12.57f, 11f, 16.17f)
                curveTo(9.44f, 16.72f, 8.62f, 18.44f, 9.17f, 20f)
                curveTo(9.72f, 21.56f, 11.44f, 22.38f, 13f, 21.83f)
                curveTo(14.56f, 21.27f, 15.38f, 19.56f, 14.83f, 18f)
                curveTo(14.53f, 17.14f, 13.85f, 16.47f, 13f, 16.17f)
                curveTo(13.47f, 12.17f, 17.47f, 11.97f, 17.95f, 11.97f)
                verticalLineTo(14.97f)
                lineTo(22f, 11f)
                moveTo(10.63f, 11.59f)
                curveTo(9.3f, 10.57f, 7.67f, 10f, 6f, 10f)
                verticalLineTo(7f)
                lineTo(2f, 11f)
                lineTo(6f, 15f)
                verticalLineTo(12f)
                curveTo(7.34f, 12.03f, 8.63f, 12.5f, 9.64f, 13.4f)
                curveTo(9.89f, 12.76f, 10.22f, 12.15f, 10.63f, 11.59f)
                close()
            }
        }.build()

        return _ArrowDecision!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDecision: ImageVector? = null
