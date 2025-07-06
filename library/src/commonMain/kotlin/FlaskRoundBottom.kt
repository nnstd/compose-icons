package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlaskRoundBottom: ImageVector
    get() {
        if (_FlaskRoundBottom != null) {
            return _FlaskRoundBottom!!
        }
        _FlaskRoundBottom = ImageVector.Builder(
            name = "FlaskRoundBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15f)
                curveTo(19f, 18.87f, 15.87f, 22f, 12f, 22f)
                curveTo(8.13f, 22f, 5f, 18.87f, 5f, 15f)
                curveTo(5f, 12.21f, 6.64f, 9.8f, 9f, 8.67f)
                verticalLineTo(5f)
                curveTo(9f, 4.45f, 9.45f, 4f, 10f, 4f)
                horizontalLineTo(10.5f)
                lineTo(9.5f, 2f)
                horizontalLineTo(14.5f)
                lineTo(13.5f, 4f)
                horizontalLineTo(14f)
                curveTo(14.55f, 4f, 15f, 4.45f, 15f, 5f)
                verticalLineTo(8.67f)
                curveTo(17.36f, 9.8f, 19f, 12.21f, 19f, 15f)
                moveTo(11f, 6f)
                verticalLineTo(10.1f)
                curveTo(8.72f, 10.56f, 7f, 12.58f, 7f, 15f)
                lineTo(7.08f, 15.91f)
                lineTo(9f, 13.93f)
                lineTo(13.07f, 18f)
                lineTo(16.93f, 14.14f)
                curveTo(16.58f, 12.12f, 15f, 10.5f, 13f, 10.1f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                moveTo(13.07f, 12f)
                curveTo(13.62f, 12f, 14.07f, 12.45f, 14.07f, 13f)
                curveTo(14.07f, 13.55f, 13.62f, 14f, 13.07f, 14f)
                curveTo(12.5f, 14f, 12.07f, 13.55f, 12.07f, 13f)
                curveTo(12.07f, 12.45f, 12.5f, 12f, 13.07f, 12f)
                close()
            }
        }.build()

        return _FlaskRoundBottom!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskRoundBottom: ImageVector? = null
