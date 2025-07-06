package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardAccountDetailsStar: ImageVector
    get() {
        if (_CardAccountDetailsStar != null) {
            return _CardAccountDetailsStar!!
        }
        _CardAccountDetailsStar = ImageVector.Builder(
            name = "CardAccountDetailsStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 22.09f)
                lineTo(22.45f, 23.58f)
                lineTo(21.8f, 20.77f)
                lineTo(24f, 18.89f)
                lineTo(21.11f, 18.64f)
                lineTo(20f, 16f)
                lineTo(18.87f, 18.64f)
                lineTo(16f, 18.89f)
                lineTo(18.18f, 20.77f)
                lineTo(17.5f, 23.58f)
                lineTo(20f, 22.09f)
                moveTo(14.08f, 21f)
                horizontalLineTo(2f)
                curveTo(0.95f, 21f, 0f, 20.05f, 0f, 19f)
                verticalLineTo(5f)
                curveTo(0f, 3.95f, 0.95f, 3f, 2f, 3f)
                horizontalLineTo(22f)
                curveTo(23.05f, 3f, 24f, 3.95f, 24f, 5f)
                verticalLineTo(15.53f)
                curveTo(22.94f, 14.58f, 21.54f, 14f, 20f, 14f)
                curveTo(16.69f, 14f, 14f, 16.69f, 14f, 20f)
                curveTo(14f, 20.34f, 14.03f, 20.68f, 14.08f, 21f)
                moveTo(8f, 13.91f)
                curveTo(6f, 13.91f, 2f, 15f, 2f, 17f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                curveTo(14f, 15f, 10f, 13.91f, 8f, 13.91f)
                moveTo(8f, 6f)
                curveTo(6.35f, 6f, 5f, 7.35f, 5f, 9f)
                curveTo(5f, 10.65f, 6.35f, 12f, 8f, 12f)
                curveTo(9.65f, 12f, 11f, 10.65f, 11f, 9f)
                curveTo(11f, 7.35f, 9.65f, 6f, 8f, 6f)
                moveTo(21f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                moveTo(22f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                moveTo(22f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _CardAccountDetailsStar!!
    }

@Suppress("ObjectPropertyName")
private var _CardAccountDetailsStar: ImageVector? = null
