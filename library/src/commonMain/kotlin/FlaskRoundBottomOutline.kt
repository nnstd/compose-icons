package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlaskRoundBottomOutline: ImageVector
    get() {
        if (_FlaskRoundBottomOutline != null) {
            return _FlaskRoundBottomOutline!!
        }
        _FlaskRoundBottomOutline = ImageVector.Builder(
            name = "FlaskRoundBottomOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15f)
                curveTo(15f, 16.66f, 13.66f, 18f, 12f, 18f)
                curveTo(10.34f, 18f, 9f, 16.66f, 9f, 15f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                curveTo(11f, 15.55f, 11.45f, 16f, 12f, 16f)
                curveTo(12.55f, 16f, 13f, 15.55f, 13f, 15f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
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
                curveTo(7f, 17.76f, 9.24f, 20f, 12f, 20f)
                curveTo(14.76f, 20f, 17f, 17.76f, 17f, 15f)
                curveTo(17f, 12.58f, 15.28f, 10.56f, 13f, 10.1f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _FlaskRoundBottomOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskRoundBottomOutline: ImageVector? = null
