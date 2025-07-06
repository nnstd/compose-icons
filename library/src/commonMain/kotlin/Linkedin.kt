package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Linkedin: ImageVector
    get() {
        if (_Linkedin != null) {
            return _Linkedin!!
        }
        _Linkedin = ImageVector.Builder(
            name = "Linkedin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(18.5f, 18.5f)
                verticalLineTo(13.2f)
                arcTo(3.26f, 3.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.24f, 9.94f)
                curveTo(14.39f, 9.94f, 13.4f, 10.46f, 12.92f, 11.24f)
                verticalLineTo(10.13f)
                horizontalLineTo(10.13f)
                verticalLineTo(18.5f)
                horizontalLineTo(12.92f)
                verticalLineTo(13.57f)
                curveTo(12.92f, 12.8f, 13.54f, 12.17f, 14.31f, 12.17f)
                arcTo(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.71f, 13.57f)
                verticalLineTo(18.5f)
                horizontalLineTo(18.5f)
                moveTo(6.88f, 8.56f)
                arcTo(1.68f, 1.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.56f, 6.88f)
                curveTo(8.56f, 5.95f, 7.81f, 5.19f, 6.88f, 5.19f)
                arcTo(1.69f, 1.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.19f, 6.88f)
                curveTo(5.19f, 7.81f, 5.95f, 8.56f, 6.88f, 8.56f)
                moveTo(8.27f, 18.5f)
                verticalLineTo(10.13f)
                horizontalLineTo(5.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(8.27f)
                close()
            }
        }.build()

        return _Linkedin!!
    }

@Suppress("ObjectPropertyName")
private var _Linkedin: ImageVector? = null
