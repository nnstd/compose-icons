package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GeneratorMobile: ImageVector
    get() {
        if (_GeneratorMobile != null) {
            return _GeneratorMobile!!
        }
        _GeneratorMobile = ImageVector.Builder(
            name = "GeneratorMobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                curveTo(2f, 20.11f, 2.9f, 21f, 4f, 21f)
                horizontalLineTo(12.1f)
                curveTo(12.03f, 20.68f, 12f, 20.34f, 12f, 20f)
                curveTo(12f, 19.66f, 12.03f, 19.32f, 12.1f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                moveTo(13f, 17f)
                curveTo(13.91f, 15.79f, 15.36f, 15f, 17f, 15f)
                curveTo(18.64f, 15f, 20.09f, 15.79f, 21f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.11f, 4f, 20f, 4f)
                horizontalLineTo(8f)
                curveTo(6.9f, 4f, 6f, 4.89f, 6f, 6f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(20f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                moveTo(14f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                moveTo(7f, 11f)
                lineTo(10f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                lineTo(9f, 15f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                moveTo(14.17f, 19f)
                curveTo(14.06f, 19.31f, 14f, 19.65f, 14f, 20f)
                curveTo(14f, 20.35f, 14.06f, 20.69f, 14.17f, 21f)
                curveTo(14.58f, 22.17f, 15.7f, 23f, 17f, 23f)
                curveTo(18.66f, 23f, 20f, 21.66f, 20f, 20f)
                curveTo(20f, 18.34f, 18.66f, 17f, 17f, 17f)
                curveTo(15.69f, 17f, 14.58f, 17.84f, 14.17f, 19f)
                close()
            }
        }.build()

        return _GeneratorMobile!!
    }

@Suppress("ObjectPropertyName")
private var _GeneratorMobile: ImageVector? = null
