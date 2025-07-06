package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDecisionAuto: ImageVector
    get() {
        if (_ArrowDecisionAuto != null) {
            return _ArrowDecisionAuto!!
        }
        _ArrowDecisionAuto = ImageVector.Builder(
            name = "ArrowDecisionAuto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                horizontalLineTo(9f)
                lineTo(13f, 1f)
                lineTo(17f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(9.43f)
                curveTo(13.25f, 9.89f, 12.58f, 10.46f, 12f, 11.12f)
                verticalLineTo(5f)
                moveTo(10.4f, 15f)
                horizontalLineTo(8.5f)
                lineTo(7.8f, 13f)
                horizontalLineTo(4.6f)
                lineTo(3.9f, 15f)
                horizontalLineTo(2f)
                lineTo(5.2f, 6f)
                horizontalLineTo(7.2f)
                lineTo(10.4f, 15f)
                moveTo(7.35f, 11.65f)
                lineTo(6.2f, 8f)
                lineTo(5.05f, 11.65f)
                horizontalLineTo(7.35f)
                moveTo(23f, 11f)
                lineTo(19f, 7f)
                verticalLineTo(10f)
                curveTo(15.39f, 9.85f, 12.31f, 12.57f, 12f, 16.17f)
                curveTo(10.44f, 16.72f, 9.62f, 18.44f, 10.17f, 20f)
                curveTo(10.72f, 21.56f, 12.44f, 22.38f, 14f, 21.83f)
                curveTo(15.56f, 21.27f, 16.38f, 19.56f, 15.83f, 18f)
                curveTo(15.53f, 17.14f, 14.85f, 16.47f, 14f, 16.17f)
                curveTo(14.47f, 12.17f, 18.47f, 11.97f, 18.95f, 11.97f)
                verticalLineTo(14.97f)
                lineTo(23f, 11f)
                close()
            }
        }.build()

        return _ArrowDecisionAuto!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDecisionAuto: ImageVector? = null
