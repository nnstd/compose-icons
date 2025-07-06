package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FrenchFries: ImageVector
    get() {
        if (_FrenchFries != null) {
            return _FrenchFries!!
        }
        _FrenchFries = ImageVector.Builder(
            name = "FrenchFries",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                lineTo(7f, 22f)
                horizontalLineTo(17f)
                lineTo(19f, 11f)
                horizontalLineTo(18f)
                moveTo(15.86f, 11f)
                curveTo(15.7f, 11.61f, 15.4f, 12.16f, 15f, 12.62f)
                verticalLineTo(8.62f)
                lineTo(17f, 9.62f)
                verticalLineTo(11f)
                horizontalLineTo(15.86f)
                moveTo(17f, 7f)
                verticalLineTo(8.5f)
                lineTo(15f, 7.5f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                moveTo(12f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(8.5f)
                lineTo(12f, 9.5f)
                verticalLineTo(5f)
                moveTo(12f, 10.62f)
                lineTo(14f, 9.62f)
                verticalLineTo(13.45f)
                curveTo(13.41f, 13.8f, 12.73f, 14f, 12f, 14f)
                verticalLineTo(10.62f)
                moveTo(11f, 13.86f)
                curveTo(10.21f, 13.65f, 9.5f, 13.22f, 9f, 12.62f)
                verticalLineTo(9.62f)
                lineTo(11f, 8.62f)
                verticalLineTo(13.86f)
                moveTo(9f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(7.5f)
                lineTo(10f, 8f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                moveTo(7f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(8.5f)
                lineTo(8f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _FrenchFries!!
    }

@Suppress("ObjectPropertyName")
private var _FrenchFries: ImageVector? = null
