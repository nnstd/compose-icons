package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphabetGreek: ImageVector
    get() {
        if (_AlphabetGreek != null) {
            return _AlphabetGreek!!
        }
        _AlphabetGreek = ImageVector.Builder(
            name = "AlphabetGreek",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 6f)
                curveTo(14.36f, 6f, 13f, 7.36f, 13f, 9f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                curveTo(15f, 8.43f, 15.43f, 8f, 16f, 8f)
                horizontalLineTo(17f)
                curveTo(17.57f, 8f, 18f, 8.43f, 18f, 9f)
                verticalLineTo(10f)
                curveTo(18f, 10.57f, 17.57f, 11f, 17f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                curveTo(17.57f, 13f, 18f, 13.43f, 18f, 14f)
                verticalLineTo(15f)
                curveTo(18f, 15.57f, 17.57f, 16f, 17f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                curveTo(18.65f, 18f, 20f, 16.65f, 20f, 15f)
                verticalLineTo(14f)
                curveTo(20f, 13.18f, 19.59f, 12.46f, 19f, 12f)
                curveTo(19.59f, 11.54f, 20f, 10.82f, 20f, 10f)
                verticalLineTo(9f)
                curveTo(20f, 7.36f, 18.65f, 6f, 17f, 6f)
                moveTo(7f, 9f)
                curveTo(5.36f, 9f, 4f, 10.36f, 4f, 12f)
                verticalLineTo(15f)
                curveTo(4f, 16.65f, 5.36f, 18f, 7f, 18f)
                horizontalLineTo(7.7f)
                curveTo(8.2f, 18f, 8.65f, 17.81f, 9f, 17.5f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(9.5f)
                curveTo(8.65f, 9.19f, 8.2f, 9f, 7.7f, 9f)
                moveTo(7f, 11f)
                horizontalLineTo(8f)
                curveTo(8.57f, 11f, 9f, 11.43f, 9f, 12f)
                verticalLineTo(15f)
                curveTo(9f, 15.57f, 8.57f, 16f, 8f, 16f)
                horizontalLineTo(7f)
                curveTo(6.43f, 16f, 6f, 15.57f, 6f, 15f)
                verticalLineTo(12f)
                curveTo(6f, 11.43f, 6.43f, 11f, 7f, 11f)
                close()
            }
        }.build()

        return _AlphabetGreek!!
    }

@Suppress("ObjectPropertyName")
private var _AlphabetGreek: ImageVector? = null
