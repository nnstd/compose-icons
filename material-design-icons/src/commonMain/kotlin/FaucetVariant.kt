package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FaucetVariant: ImageVector
    get() {
        if (_FaucetVariant != null) {
            return _FaucetVariant!!
        }
        _FaucetVariant = ImageVector.Builder(
            name = "FaucetVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 21f)
                horizontalLineTo(3f)
                curveTo(3f, 19.9f, 3.9f, 19f, 5f, 19f)
                horizontalLineTo(19f)
                curveTo(20.11f, 19f, 21f, 19.89f, 21f, 21f)
                moveTo(19f, 7f)
                curveTo(19f, 5.39f, 17.93f, 3f, 15f, 3f)
                reflectiveCurveTo(11f, 5.39f, 11f, 7f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                curveTo(13f, 6.54f, 13.17f, 5f, 15f, 5f)
                reflectiveCurveTo(17f, 6.54f, 17f, 7f)
                horizontalLineTo(16.5f)
                verticalLineTo(9f)
                horizontalLineTo(19.5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                moveTo(7f, 12f)
                curveTo(6.45f, 12f, 6f, 12.45f, 6f, 13f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                curveTo(8f, 12.45f, 7.55f, 12f, 7f, 12f)
                moveTo(21f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                curveTo(18f, 12.45f, 17.55f, 12f, 17f, 12f)
                reflectiveCurveTo(16f, 12.45f, 16f, 13f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _FaucetVariant!!
    }

@Suppress("ObjectPropertyName")
private var _FaucetVariant: ImageVector? = null
